package reviewsitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsSiteController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	TagRepository tagRepo;

	@RequestMapping("/")
	public String redirectToReviews(Model model) {
		return "redirect:/reviews";
	}

	@RequestMapping("/reviews")
	public String showAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/review")
	public String showOneReview(@RequestParam(value = "genreId") Long reviewId, Model model) {
		model.addAttribute("review", reviewRepo.findOne(reviewId));
		return "review";
	}

	@RequestMapping("/categories")
	public String showAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/category")
	public String showOneCategory(@RequestParam Long categoryId, Model model) {
		model.addAttribute("category", categoryRepo.findOne(categoryId));
		return "category";
	}

	@RequestMapping("/tags")
	public String showAllTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String showOneTag(@RequestParam Long tagId, Model model) {
		model.addAttribute("tag", tagRepo.findOne(tagId));
		return "tag";
	}
}
