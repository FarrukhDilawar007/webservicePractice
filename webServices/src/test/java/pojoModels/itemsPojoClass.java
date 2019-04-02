package pojoModels;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.xml.internal.ws.api.message.Message;

 public class itemsPojoClass {

	@SerializedName("status")
	@Expose
	private Boolean status;
	@SerializedName("totalCount")
	@Expose
	private Integer totalCount;
	@SerializedName("message")
	@Expose
	private List<Itemattributes> message = null;

	public Boolean getStatus() {
	return status;
	}

	public void setStatus(Boolean status) {
	this.status = status;
	}

	public Integer getTotalCount() {
	return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
	this.totalCount = totalCount;
	}

	public List<Itemattributes> getMessage() {
	return message;
	}

	public void setMessage(List<Itemattributes> message) {
	this.message = message;
	}

 }
 

