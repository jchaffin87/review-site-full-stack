package reviewsitefullstack;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long tagId;
	private String tagName;

	@ManyToMany(mappedBy = "tags")
	protected Set<Review> reviewsTagged = new HashSet<Review>();

	protected Tag() {

	}

	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Long getTagId() {
		return tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public Set<Review> getReviewsTagged() {
		return reviewsTagged;
	}

	@Override
	public String toString() {
		return String.format("Tag[tagId=%d, tagName='%s']", tagId, tagName);
	}

}
