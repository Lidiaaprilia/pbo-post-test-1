/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;

/**
 *
 * @author Lidia
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Book
        ArrayList<Book> books = new ArrayList<>();
        
        // Isi ArrayList dengan objek Book
        books.add(new Book("The Da Vinci Code", "Dan Brown"));
        books.add(new Book("The Alchemist", "Paulo Coelho"));
        books.add(new Book("Sophie's World", "Jostein Gaarder"));
        books.add(new Book("The Fault In Our Stars", "John Green"));
        books.add(new Book("Me Before You", "Jojo Moyes"));

        // Lakukan perulangan untuk menampilkan informasi tentang buku-buku
        for (Book book : books) {
            System.out.println("Buku berjudul " + book.title + " ditulis oleh " + book.author + ".");
        }
    }
}






