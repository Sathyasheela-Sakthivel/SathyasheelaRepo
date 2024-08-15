package webElement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interaction_xpath {
	public Interaction_xpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\'app\']/div/div/div[2]/div/div[5]/div/div[3]/h5")
	public WebElement Interaction_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Sortable')]")
	public WebElement Interaction_xp_Sortable_Submenu;

	@FindBy(css = "#demo-tabpane-list .list-group-item.list-group-item-action")
	public List<WebElement> Interaction_xp_List_Submenu;

	// @FindBy(css = "//*[@id=\'list-group-item list-group-item-action\']")
	// public WebElement tab_grid;

	@FindBy(id = "demo-tab-grid")
	public WebElement tab_grid_menu;

	@FindBy(css = "#demo-tabpane-grid .list-group-item.list-group-item-action")
	public List<WebElement> interaction_grid_list;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Selectable')]")
	public WebElement Inter_Selectable;

	@FindBy(css = "#demo-tabpane-list .mt-2.list-group-item.list-group-item-action")
	public List<WebElement> SelectableTabList_before;

	@FindBy(css = "#demo-tabpane-list .mt-2.list-group-item.active.list-group-item-action")
	public List<WebElement> SelectableTabList_after;

	@FindBy(id = "demo-tab-grid")
	public WebElement SelectableTabgrid;

	@FindBy(css = "#demo-tabpane-grid .list-group-item.list-group-item-action")
	public List<WebElement> SelectableTabgrid_before;

	@FindBy(css = "#demo-tabpane-grid .list-group-item.active.list-group-item-action")
	public List<WebElement> SelectableTabgrid_after;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Droppable')]")
	public WebElement Droppable_submenu;

	@FindBy(xpath = "//*[@id=\"draggable\"]")
	public WebElement draggable_tab;

	@FindBy(xpath = "//*[@id=\"droppable\"]")
	public WebElement droppable_tab;

	@FindBy(xpath = "//*[@id=\"droppable\"]/p")
	public WebElement dropped_text;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Resizable')]")
	public WebElement Resizable_submenu;

	@FindBy(id = "resizableBoxWithRestriction")
	public WebElement resizableBoxWithRestriction;

	@FindBy(id = "resizable")
	public WebElement resizable;

	@FindBy(css = ".react-resizable-handle.react-resizable-handle-se")
	public List<WebElement> boxpointrest;

}
