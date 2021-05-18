package com.example.postaldetail.models.postaldetail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostOffice {

    @JsonProperty("Name")
    String name;

    @JsonProperty("Description")
    String description;

    @JsonProperty("BranchType")
    String branchType;

    @JsonProperty("DeliveryStatus")
    String deliveryStatus;

    @JsonProperty("Circle")
    String circle;

    @JsonProperty("District")
    String district;

    @JsonProperty("Division")
    String division;

    @JsonProperty("Region")
    String region;

    @JsonProperty("Block")
    String block;

    @JsonProperty("State")
    String state;

    @JsonProperty("Country")
    String country;

    @JsonProperty("Pincode")
    String pincode;

    public PostOffice() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getBranchType() {
        return this.branchType;
    }

    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public String getCircle() {
        return this.circle;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getDivision() {
        return this.division;
    }

    public String getRegion() {
        return this.region;
    }

    public String getBlock() {
        return this.block;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PostOffice)) return false;
        final PostOffice other = (PostOffice) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$branchType = this.getBranchType();
        final Object other$branchType = other.getBranchType();
        if (this$branchType == null ? other$branchType != null : !this$branchType.equals(other$branchType))
            return false;
        final Object this$deliveryStatus = this.getDeliveryStatus();
        final Object other$deliveryStatus = other.getDeliveryStatus();
        if (this$deliveryStatus == null ? other$deliveryStatus != null : !this$deliveryStatus.equals(other$deliveryStatus))
            return false;
        final Object this$circle = this.getCircle();
        final Object other$circle = other.getCircle();
        if (this$circle == null ? other$circle != null : !this$circle.equals(other$circle)) return false;
        final Object this$district = this.getDistrict();
        final Object other$district = other.getDistrict();
        if (this$district == null ? other$district != null : !this$district.equals(other$district)) return false;
        final Object this$division = this.getDivision();
        final Object other$division = other.getDivision();
        if (this$division == null ? other$division != null : !this$division.equals(other$division)) return false;
        final Object this$region = this.getRegion();
        final Object other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false;
        final Object this$block = this.getBlock();
        final Object other$block = other.getBlock();
        if (this$block == null ? other$block != null : !this$block.equals(other$block)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$pincode = this.getPincode();
        final Object other$pincode = other.getPincode();
        if (this$pincode == null ? other$pincode != null : !this$pincode.equals(other$pincode)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PostOffice;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $branchType = this.getBranchType();
        result = result * PRIME + ($branchType == null ? 43 : $branchType.hashCode());
        final Object $deliveryStatus = this.getDeliveryStatus();
        result = result * PRIME + ($deliveryStatus == null ? 43 : $deliveryStatus.hashCode());
        final Object $circle = this.getCircle();
        result = result * PRIME + ($circle == null ? 43 : $circle.hashCode());
        final Object $district = this.getDistrict();
        result = result * PRIME + ($district == null ? 43 : $district.hashCode());
        final Object $division = this.getDivision();
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        final Object $region = this.getRegion();
        result = result * PRIME + ($region == null ? 43 : $region.hashCode());
        final Object $block = this.getBlock();
        result = result * PRIME + ($block == null ? 43 : $block.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $pincode = this.getPincode();
        result = result * PRIME + ($pincode == null ? 43 : $pincode.hashCode());
        return result;
    }

    public String toString() {
        return "PostOffice(name=" + this.getName() + ", description=" + this.getDescription() + ", branchType=" + this.getBranchType() + ", deliveryStatus=" + this.getDeliveryStatus() + ", circle=" + this.getCircle() + ", district=" + this.getDistrict() + ", division=" + this.getDivision() + ", region=" + this.getRegion() + ", block=" + this.getBlock() + ", state=" + this.getState() + ", country=" + this.getCountry() + ", pincode=" + this.getPincode() + ")";
    }
}
