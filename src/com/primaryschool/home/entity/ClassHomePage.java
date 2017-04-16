package com.primaryschool.home.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @ClassName: Classhomepage
 * @Description: TODO  班级主页实体类
 * @author zsk
 * @date 2017年4月5日 下午7:20:48
 *
 */

@Entity
@Table(name="ps_class_homepage")
public class ClassHomePage implements Serializable{
		
	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name="item_title")
		private String itemTitle;
		
		@Column(name="item_content")
		private String itemContent;
		
		@Column(name="item_author")
		private String itemAuthor;
		
		@Column(name="type_id")
		private int  typeId;
		
		@Column(name="add_time")
		private String addTime;
		
		@Column(name="view_count")
		private int viewCount;
		
		@Column(name="is_image")
		private int isImage;
		
		@Column(name="is_publish")
		private int isPublish;
		
		@Column(name="class_id")
		private int classId;

		//临时属性
	    @Transient
	    private String itemTypeFlag;
	    
	    @Transient
		private String itemTypeName;
		
		public ClassHomePage(){}
	    
	    public ClassHomePage(int id,String itemTitle,String addTime,String itemAuthor){
	    	super();
	    	this.id = id;
			this.itemTitle = itemTitle;
			this.addTime = addTime;
			this.itemAuthor=itemAuthor;
	    }
			
	    public ClassHomePage(int classId,int id , String itemTitle,String itemAuthor,String addTime,int viewCount){
	    	super();
	    	this.id = id;
	    	this.classId=classId;
			this.itemTitle = itemTitle;
			this.itemAuthor=itemAuthor;
			this.addTime = addTime;
			this.viewCount =viewCount;
	    }
	    
	    public ClassHomePage(int id, String itemTitle, String itemContent,String itemAuthor, String addTime, int viewCount, 
				  String itemTypeName,String itemTypeFlag) {
			super();
			this.id = id;
			this.itemTitle = itemTitle;
			this.itemAuthor=itemAuthor;
			this.itemContent = itemContent;
			this.addTime = addTime;
			this.viewCount = viewCount;
			this.itemTypeName = itemTypeName;
			this.itemTypeFlag = itemTypeFlag;
		}
	    
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getItemTitle() {
			return itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getItemContent() {
			return itemContent;
		}

		public void setItemContent(String itemContent) {
			this.itemContent = itemContent;
		}

		public int getTypeId() {
			return typeId;
		}

		public void setTypeId(int typeId) {
			this.typeId = typeId;
		}

		public String getAddTime() {
			return addTime;
		}

		public void setAddTime(String addTime) {
			this.addTime = addTime;
		}

		public int getViewCount() {
			return viewCount;
		}

		public void setViewCount(int viewCount) {
			this.viewCount = viewCount;
		}

		public int getIsImage() {
			return isImage;
		}

		public void setIsImage(int isImage) {
			this.isImage = isImage;
		}

		public int getIsPublish() {
			return isPublish;
		}

		public void setIsPublish(int isPublish) {
			this.isPublish = isPublish;
		}

		public String getItemTypeFlag() {
			return itemTypeFlag;
		}

		public void setItemTypeFlag(String itemTypeFlag) {
			this.itemTypeFlag = itemTypeFlag;
		}

		public String getItemTypeName() {
			return itemTypeName;
		}

		public void setItemTypeName(String itemTypeName) {
			this.itemTypeName = itemTypeName;
		}

		public int getClassId() {
			return classId;
		}

		public void setClassId(int classId) {
			this.classId = classId;
		}

		public String getItemAuthor() {
			return itemAuthor;
		}

		public void setItemAuthor(String itemAuthor) {
			this.itemAuthor = itemAuthor;
		}
		

}