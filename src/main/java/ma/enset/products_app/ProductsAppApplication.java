package ma.enset.products_app;

import ma.enset.products_app.entities.Product;
import ma.enset.products_app.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository repo) {
		return args -> {

			// 1. Ajouter des produits
			repo.save(Product.builder().name("Laptop Dell").price(12000).quantity(10).build());
			repo.save(Product.builder().name("Souris Logitech").price(350).quantity(50).build());
			repo.save(Product.builder().name("Clavier Mécanique").price(800).quantity(30).build());
			repo.save(Product.builder().name("Laptop HP").price(9500).quantity(8).build());

			// 2. Consulter tous les produits
			System.out.println("=== TOUS LES PRODUITS ===");
			repo.findAll().forEach(System.out::println);

			// 3. Consulter un produit par ID
			System.out.println("=== PRODUIT ID=1 ===");
			System.out.println(repo.findById(1L).get());

			// 4. Chercher des produits
			System.out.println("=== RECHERCHE 'laptop' ===");
			repo.findByNameContainingIgnoreCase("laptop").forEach(System.out::println);

			// 5. Mettre à jour
			System.out.println("=== MISE A JOUR ===");
			Product p = repo.findById(1L).get();
			p.setPrice(10500);
			repo.save(p);
			System.out.println(repo.findById(1L).get());

			// 6. Supprimer
			repo.deleteById(2L);
			System.out.println("=== APRES SUPPRESSION : " + repo.count() + " produits ===");
		};
	}
}