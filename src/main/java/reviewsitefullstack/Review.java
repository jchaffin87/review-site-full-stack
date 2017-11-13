package reviewsitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long reviewId;
	private String reviewTitle;
	private String imageUrl;

	@Lob
	private String reviewContent;

	@ManyToOne
	private Category category;

	@ManyToMany
	private Set<Tag> tags;

	protected Review() {

	}

	public Review(Category category, String reviewTitle, String imageUrl, String reviewContent, Tag... tags) {
		this.category = category;
		this.reviewTitle = reviewTitle;
		this.imageUrl = imageUrl;
		this.reviewContent = reviewContent;
		this.tags = new HashSet<>(Arrays.asList(tags));

	}

	public Long getReviewId() {
		return reviewId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public Category getCategory() {
		return category;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	// public void addTag(String tagName) {
	// if (!tagName.equals("")) {
	// Tag newTag = new Tag(tagName);
	// tags.add(newTag);
	// }
	// }

	@Override
	public String toString() {
		return String.format(
				"Review[reviewId='%d', category='%s', reviewTitle='%s', imageUrl='%s', reviewContent='%s', tag='%s']",
				reviewId, category, reviewTitle, imageUrl, reviewContent, tags);
	}

}
