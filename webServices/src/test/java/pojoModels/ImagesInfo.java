package pojoModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagesInfo {

@SerializedName("ratio")
@Expose
private Double ratio;
@SerializedName("height")
@Expose
private Integer height;
@SerializedName("width")
@Expose
private Integer width;

public Double getRatio() {
return ratio;
}

public void setRatio(Double ratio) {
this.ratio = ratio;
}

public Integer getHeight() {
return height;
}

public void setHeight(Integer height) {
this.height = height;
}

public Integer getWidth() {
return width;
}

public void setWidth(Integer width) {
this.width = width;
}

}
