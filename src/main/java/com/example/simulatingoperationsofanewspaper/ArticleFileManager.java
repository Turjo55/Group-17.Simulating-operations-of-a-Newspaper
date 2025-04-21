package com.example.simulatingoperationsofanewspaper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleFileManager {
    private static final String ARTICLES_DIR = "articles/";
    private static final String FILE_EXTENSION = ".bin";

    static {
        // Create articles directory if it doesn't exist
        new File(ARTICLES_DIR).mkdirs();
    }

    public static void saveArticle(Article article) throws IOException {
        String filename = ARTICLES_DIR + article.getTitle().replaceAll("[^a-zA-Z0-9]", "_") + FILE_EXTENSION;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(article);
        }
    }

    public static Article loadArticle(String title) throws IOException, ClassNotFoundException {
        String filename = ARTICLES_DIR + title.replaceAll("[^a-zA-Z0-9]", "_") + FILE_EXTENSION;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Article) ois.readObject();
        }
    }

    public static List<Article> loadAllArticles() throws IOException, ClassNotFoundException {
        List<Article> articles = new ArrayList<>();
        File dir = new File(ARTICLES_DIR);
        File[] files = dir.listFiles((d, name) -> name.endsWith(FILE_EXTENSION));

        if (files != null) {
            for (File file : files) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    articles.add((Article) ois.readObject());
                }
            }
        }
        return articles;
    }

    public static List<Article> loadArticlesByAuthor(String author) throws IOException, ClassNotFoundException {
        List<Article> allArticles = loadAllArticles();
        List<Article> authorArticles = new ArrayList<>();

        for (Article article : allArticles) {
            if (article.getAuthor().equals(author)) {
                authorArticles.add(article);
            }
        }
        return authorArticles;
    }

    public static void saveArticleToFile(Article article, String filename) throws IOException {
        List<Article> articles = new ArrayList<>();
        File file = new File(filename);

        // If file exists, load existing articles
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                articles = (List<Article>) ois.readObject();
            } catch (ClassNotFoundException e) {
                throw new IOException("Error reading existing articles", e);
            }
        }

        // Add or update the article
        boolean found = false;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getTitle().equals(article.getTitle()) &&
                    articles.get(i).getAuthor().equals(article.getAuthor())) {
                articles.set(i, article);
                found = true;
                break;
            }
        }
        if (!found) {
            articles.add(article);
        }

        // Save back to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(articles);
        }
    }

    public static List<Article> loadArticlesFromFile(String filename) throws IOException, ClassNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Article>) ois.readObject();
        }
    }

    public static void removeArticleFromFile(Article article, String filename) throws IOException {
        List<Article> articles = new ArrayList<>();
        File file = new File(filename);

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                articles = (List<Article>) ois.readObject();
            } catch (ClassNotFoundException e) {
                throw new IOException("Error reading existing articles", e);
            }
        }

        // Remove the article
        articles.removeIf(a -> a.getTitle().equals(article.getTitle()) &&
                a.getAuthor().equals(article.getAuthor()));

        // Save back to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(articles);
        }
    }
}