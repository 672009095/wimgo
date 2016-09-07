package com.ramakusumadigara.wimgo.service;

import com.ramakusumadigara.wimgo.service.categories.Categories;
import com.ramakusumadigara.wimgo.service.contact.Contact;
import com.ramakusumadigara.wimgo.service.herenow.HereNow;
import com.ramakusumadigara.wimgo.service.location.Location;
import com.ramakusumadigara.wimgo.service.specials.Specials;
import com.ramakusumadigara.wimgo.service.stats.Stats;
import com.ramakusumadigara.wimgo.service.venuechains.VenueChains;

import java.util.List;

/**
 * Created by skyshi on 07/09/16.
 */
public class Venues {
    private String id;
    private String name;
    private Contact contact;
    private Location location;
    private List<Categories> categories;
    private boolean verified;
    private Stats stats;
    private String url;
    private boolean allowMenuUrlEdit;
    private Specials specials;
    private HereNow hereNow;
    private String referralId;
    private List<VenueChains>venueChains;
    private boolean hasPerk;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isAllowMenuUrlEdit() {
        return allowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit) {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    public Specials getSpecials() {
        return specials;
    }

    public void setSpecials(Specials specials) {
        this.specials = specials;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public List<VenueChains> getVenueChains() {
        return venueChains;
    }

    public void setVenueChains(List<VenueChains> venueChains) {
        this.venueChains = venueChains;
    }

    public boolean isHasPerk() {
        return hasPerk;
    }

    public void setHasPerk(boolean hasPerk) {
        this.hasPerk = hasPerk;
    }
}
