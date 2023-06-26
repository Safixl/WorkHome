package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    public static class MarkTwainBook extends Book{

        Book book = new MarkTwainBook(getBook().author);
        public MarkTwainBook(String autor){
            new MarkTwainBook(super.getBook().author);
        }
        @Override
        public MarkTwainBook getBook() {
            return new MarkTwainBook();
        }

        @Override
        public String getTitle() {
            return null;
        }

    }
    public static class AgathaChristieBook extends Book{

        public AgathaChristieBook(String autor){
            super(autor);
        }
        @Override
        public AgathaChristieBook getBook() {
            return new AgathaChristieBook();
        }

        @Override
        public String getTitle() {
            return null;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
