package com.pluralsight.bookstore.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 10000)
    private String description;

    @Column(name = "unit_cost")
    private Float unitCost;

    @Column(length = 50)
    private String isbn;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;

    @Column(name = "image_url")
    private String imageURL;

    @Enumerated
    private Language language;

    public Book() {
    }

    public Book(String isbn, String title, Float unitCost, Integer nbOfPages, Language language, Date publicationDate, String imageURL, String description) {
        this.isbn = isbn;
        this.title = title;
        this.unitCost = unitCost;
        this.nbOfPages = nbOfPages;
        this.language = language;
        this.publicationDate = publicationDate;
        this.imageURL = imageURL;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public String getImageUrl() {
        return imageURL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", unitCost=" + unitCost +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                ", nbOfPages=" + nbOfPages +
                ", imageUrl='" + imageURL + '\'' +
                ", language=" + language +
                '}';
    }
}
