package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int stockQuantity;
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
    }
}
