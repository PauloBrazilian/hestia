package hestia.msStore.model;

import hestia.msStore.payload.CategoryDto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "Product")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "product_lista",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "productId" ),
            inverseJoinColumns = @JoinColumn(name = "lista_id"))
    private List<Lista> lists;

    @OneToMany
    @JoinColumn(name = "categories_Id")
    private Set<Category> categories;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Lista> getLists() {
        return lists;
    }

    public void setLists(List<Lista> lists) {
        this.lists = lists;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}