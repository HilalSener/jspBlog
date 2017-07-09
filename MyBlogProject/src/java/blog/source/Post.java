
package blog.source;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Post implements Serializable{
    public int postId;
    public int categoryId;
    public String postTitle;
    public String postDate;
    public String postImgUrl;
    public String postText;
    public String comments_enabled;
    
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public LocalDateTime getPostDate() {
        LocalDateTime postDate = LocalDateTime.now();
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public void setPostImgUrl(String postImgUrl) {
        this.postImgUrl = postImgUrl;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String isComments_enabled() {
        return comments_enabled;
    }

    public void setComments_enabled(String comments_enabled) {
        this.comments_enabled = comments_enabled;
    }
    
    public void addPost(String postTitle, String postDate, String postImgUrl, String postText, String comments_enabled) throws Exception
    {
        //Db db = new DB();
        String sql = "insert into post values(0, '%s', '%s', '%s', '%s', '%s')";
        
    }
}
