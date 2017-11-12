package reviewsitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewSitePopulator implements CommandLineRunner {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Category category1 = new Category("Fine Dining");
		categoryRepo.save(category1);
		Category category2 = new Category("Moderately Priced");
		categoryRepo.save(category2);
		Category category3 = new Category("Cheap Eats");
		categoryRepo.save(category3);

		Tag tag1 = new Tag("American");
		tagRepo.save(tag1);
		Tag tag2 = new Tag("French");
		tagRepo.save(tag2);
		Tag tag3 = new Tag("Italian");
		tagRepo.save(tag3);
		Tag tag4 = new Tag("Seafood");
		tagRepo.save(tag4);
		Tag tag5 = new Tag("Bar");
		tagRepo.save(tag5);
		Tag tag6 = new Tag("Steakhouse");
		tagRepo.save(tag6);
		Tag tag7 = new Tag("Mexican");
		tagRepo.save(tag7);
		Tag tag8 = new Tag("Cafe");
		tagRepo.save(tag8);

		Review review1 = new Review(category1, "Mitchell's Ocean Club", "/images/mitchell-s-ocean-club.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1, tag4, tag6);
		reviewRepo.save(review1);
		Review review2 = new Review(category1, "The Melting Pot", "/images/the-melting-pot.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag2);
		reviewRepo.save(review2);
		Review review3 = new Review(category1, "Lindsey's", "/images/lindseys.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1);
		reviewRepo.save(review3);
		Review review4 = new Review(category2, "Z Cucina di Spirito", "/images/z-cucina-di-spirito.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag3);
		reviewRepo.save(review4);
		Review review5 = new Review(category2, "Northstar Cafe", "/images/northstar-cafe.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1, tag8);
		reviewRepo.save(review5);
		Review review6 = new Review(category2, "The Thurman Cafe", "/images/the-thurman-cafe.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1, tag5);
		reviewRepo.save(review6);
		Review review7 = new Review(category3, "Hot Chicken Takeover", "/images/hot-chicken-takeover.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1);
		reviewRepo.save(review7);
		Review review8 = new Review(category3, "Condado", "/images/condado.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag5, tag7);
		reviewRepo.save(review8);
		Review review9 = new Review(category3, "Dirty Frank's Hot Dog Palace", "/images/dirty-franks.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
						+ "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
						+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui "
						+ "officia deserunt mollit anim id est laborum.",
				tag1);
		reviewRepo.save(review9);

	}

	public ReviewSitePopulator() {

	}

}
