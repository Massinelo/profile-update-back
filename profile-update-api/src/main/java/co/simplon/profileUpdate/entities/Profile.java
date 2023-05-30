package co.simplon.profileUpdate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile extends AbstractEntity {

    @Column(name = "description")
    private String description;

    @Column(name = "avatar")
    private String avatar;

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getAvatar() {
	return avatar;
    }

    public void setAvatar(String avatar) {
	this.avatar = avatar;
    }

    @Override
    public String toString() {
	return " {description=" + description + ", avatar="
		+ avatar + "}";
    }

}
