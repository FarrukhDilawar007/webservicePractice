package pojoModels;

	import java.util.List;
	import com.google.gson.annotations.Expose;
	import com.google.gson.annotations.SerializedName;

	public class Itemattributes {

	@SerializedName("loc")
	@Expose
	private ItemsLocation loc;
	@SerializedName("chargeTime")
	@Expose
	private long chargeTime;
	@SerializedName("images_path")
	@Expose
	private List<String> imagesPath = null;
	@SerializedName("images_small_path")
	@Expose
	private List<String> imagesSmallPath = null;
	@SerializedName("images_info")
	@Expose
	private List<ImagesInfo> imagesInfo = null;
	@SerializedName("startTime")
	@Expose
	private long startTime;
	@SerializedName("visibility")
	@Expose
	private Boolean visibility;
	@SerializedName("old_small_images")
	@Expose
	private List<String> oldSmallImages = null;
	@SerializedName("old_images")
	@Expose
	private List<String> oldImages = null;
	@SerializedName("_id")
	@Expose
	private String id;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("startPrice")
	@Expose
	private Integer startPrice;
	@SerializedName("itemCategory")
	@Expose
	private String itemCategory;
	@SerializedName("itemAuctionType")
	@Expose
	private String itemAuctionType;
	@SerializedName("uid")
	@Expose
	private String uid;
	@SerializedName("condition")
	@Expose
	private String condition;
	@SerializedName("endTime")
	@Expose
	private long endTime;
	@SerializedName("currency_symbol")
	@Expose
	private String currencySymbol;
	@SerializedName("quantity")
	@Expose
	private Integer quantity;
	@SerializedName("zipcode")
	@Expose
	private Integer zipcode;
	@SerializedName("state")
	@Expose
	private String state;

	public ItemsLocation getLoc() {
	return loc;
	}

	public void setLoc(ItemsLocation loc) {
	this.loc = loc;
	}

	public long getChargeTime() {
	return chargeTime;
	}

	public void setChargeTime(long chargeTime) {
	this.chargeTime = chargeTime;
	}

	public List<String> getImagesPath() {
	return imagesPath;
	}

	public void setImagesPath(List<String> imagesPath) {
	this.imagesPath = imagesPath;
	}

	public List<String> getImagesSmallPath() {
	return imagesSmallPath;
	}

	public void setImagesSmallPath(List<String> imagesSmallPath) {
	this.imagesSmallPath = imagesSmallPath;
	}

	public List<ImagesInfo> getImagesInfo() {
	return imagesInfo;
	}

	public void setImagesInfo(List<ImagesInfo> imagesInfo) {
	this.imagesInfo = imagesInfo;
	}

	public long getStartTime() {
	return startTime;
	}

	public void setStartTime(long startTime) {
	this.startTime = startTime;
	}

	public Boolean getVisibility() {
	return visibility;
	}

	public void setVisibility(Boolean visibility) {
	this.visibility = visibility;
	}

	public List<String> getOldSmallImages() {
	return oldSmallImages;
	}

	public void setOldSmallImages(List<String> oldSmallImages) {
	this.oldSmallImages = oldSmallImages;
	}

	public List<String> getOldImages() {
	return oldImages;
	}

	public void setOldImages(List<String> oldImages) {
	this.oldImages = oldImages;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public Integer getStartPrice() {
	return startPrice;
	}

	public void setStartPrice(Integer startPrice) {
	this.startPrice = startPrice;
	}

	public String getItemCategory() {
	return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
	this.itemCategory = itemCategory;
	}

	public String getItemAuctionType() {
	return itemAuctionType;
	}

	public void setItemAuctionType(String itemAuctionType) {
	this.itemAuctionType = itemAuctionType;
	}

	public String getUid() {
	return uid;
	}

	public void setUid(String uid) {
	this.uid = uid;
	}

	public String getCondition() {
	return condition;
	}

	public void setCondition(String condition) {
	this.condition = condition;
	}

	public long getEndTime() {
	return endTime;
	}

	public void setEndTime(long endTime) {
	this.endTime = endTime;
	}

	public String getCurrencySymbol() {
	return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
	this.currencySymbol = currencySymbol;
	}

	public Integer getQuantity() {
	return quantity;
	}

	public void setQuantity(Integer quantity) {
	this.quantity = quantity;
	}

	public Integer getZipcode() {
	return zipcode;
	}

	public void setZipcode(Integer zipcode) {
	this.zipcode = zipcode;
	}

	public String getState() {
	return state;
	}

	public void setState(String state) {
	this.state = state;
	}

	}
	

