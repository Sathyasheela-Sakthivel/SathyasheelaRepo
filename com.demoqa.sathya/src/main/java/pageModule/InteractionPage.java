package pageModule;

import webElement.Form_xpath;
import webElement.Interaction_xpath;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.BasicFunction;

public class InteractionPage extends Base {

	BasicFunction fun = new BasicFunction();

	public void Interaction_menu() {
		Form_xpath form_xp = new Form_xpath(driver);
		Interaction_xpath interaction_xp = new Interaction_xpath(driver);

		fun.Click(driver, form_xp.Form_adv);
		fun.jsSrollIntoElement(driver, interaction_xp.Interaction_menu);
		fun.Click(driver, interaction_xp.Interaction_menu);
		fun.fluentWait(driver, interaction_xp.Interaction_xp_Sortable_Submenu);
		System.out.println("InteractionPage Menu Clicked");

	}

	public void Sortable_Submenu(ExtentTest test) throws InterruptedException, IOException {

		Interaction_xpath interaction_xp = new Interaction_xpath(driver);
		fun.jsSrollIntoElement(driver, interaction_xp.Interaction_xp_Sortable_Submenu);

		fun.Click(driver, interaction_xp.Interaction_xp_Sortable_Submenu);
		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.Interaction_xp_List_Submenu.get(0));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(interaction_xp.Interaction_xp_List_Submenu.get(0),
				interaction_xp.Interaction_xp_List_Submenu.get(3)).perform();
		test.log(LogStatus.PASS, "List_case1, passed", test.addScreenCapture(fun.capture(driver)));
		Thread.sleep(700);

		Actions builder1 = new Actions(driver);
		builder1.dragAndDrop(interaction_xp.Interaction_xp_List_Submenu.get(1),
				interaction_xp.Interaction_xp_List_Submenu.get(4)).perform();
		test.log(LogStatus.PASS, "List_case2, passed", test.addScreenCapture(fun.capture(driver)));

		fun.Click(driver, interaction_xp.tab_grid_menu);
		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.tab_grid_menu);
		Actions builder2 = new Actions(driver);
		builder2.dragAndDrop(interaction_xp.interaction_grid_list.get(0), interaction_xp.interaction_grid_list.get(3))
				.perform();
		test.log(LogStatus.PASS, "Grid_case1, passed", test.addScreenCapture(fun.capture(driver)));
		Thread.sleep(700);

		Actions builder3 = new Actions(driver);
		builder3.dragAndDrop(interaction_xp.interaction_grid_list.get(3), interaction_xp.interaction_grid_list.get(5))
				.perform();
		test.log(LogStatus.PASS, "Grid_case2, passed", test.addScreenCapture(fun.capture(driver)));
		Thread.sleep(700);

		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.interaction_grid_list.get(0));
		Actions builder4 = new Actions(driver);
		builder4.dragAndDrop(interaction_xp.interaction_grid_list.get(1), interaction_xp.interaction_grid_list.get(4))
				.perform();
		Thread.sleep(500);
		test.log(LogStatus.PASS, "Grid_case3, PASSED", test.addScreenCapture(fun.capture(driver)));
	}

	public void selectable(ExtentTest test) throws IOException, InterruptedException {
		Interaction_xpath interaction_xp = new Interaction_xpath(driver);

		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.Inter_Selectable);
		fun.jsSrollIntoElement(driver, interaction_xp.Inter_Selectable);
		fun.Click(driver, interaction_xp.Inter_Selectable);
		System.out.println("Inter Selectable submenu is clicked");

		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.SelectableTabList_before.get(0));

		for (int i = 0; i <= 3; i++) {
			fun.Click(driver, interaction_xp.SelectableTabList_before.get(i));
			System.out.println("SelectableTabList is clicked");
		}
		Thread.sleep(1000);
		if (interaction_xp.SelectableTabList_after.get(0).isDisplayed()
				&& interaction_xp.SelectableTabList_after.get(1).isDisplayed()
				&& interaction_xp.SelectableTabList_after.get(2).isDisplayed()
				&& interaction_xp.SelectableTabList_after.get(3).isDisplayed()) {
			System.out.println("Selected List, PASSED");
			test.log(LogStatus.PASS, "Selected List, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Selected LIST, FAILED");
			test.log(LogStatus.FAIL, "Selected List, FAILED", test.addScreenCapture(fun.capture(driver)));

		}
		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.SelectableTabgrid);
		fun.jsSrollIntoElement(driver, interaction_xp.SelectableTabgrid);
		fun.Click(driver, interaction_xp.SelectableTabgrid);
		System.out.println("SelectableTabgrid is clicked");

		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.SelectableTabgrid_before.get(0));

		for (int i = 0; i <= 8; i++) {
			fun.Click(driver, interaction_xp.SelectableTabgrid_before.get(i));
			System.out.println("SelectableTabList_before is clicked");
			test.log(LogStatus.PASS, "SelectableTabList_before, PASSED", test.addScreenCapture(fun.capture(driver)));
		}

		Thread.sleep(1000);
		if (interaction_xp.SelectableTabgrid_after.get(0).isDisplayed()) {
			System.out.println("Selected Grid, PASSED");
			test.log(LogStatus.PASS, "Selected Grid, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Selected Grid, FAILED");
			test.log(LogStatus.FAIL, "Selected Grid, FAILED", test.addScreenCapture(fun.capture(driver)));
		}
	}

	public void Droppable(ExtentTest test) throws IOException, InterruptedException {
		Interaction_xpath interaction_xp = new Interaction_xpath(driver);

		fun.fluentWait(driver, interaction_xp.Droppable_submenu);
		fun.jsSrollIntoElement(driver, interaction_xp.Droppable_submenu);

		fun.Click(driver, interaction_xp.Droppable_submenu);
		fun.fluentWait(driver, interaction_xp.draggable_tab);
		Thread.sleep(700);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(interaction_xp.draggable_tab, interaction_xp.droppable_tab).perform();

		fun.fluentWait(driver, interaction_xp.dropped_text);
		System.out.println(interaction_xp.dropped_text.getText());
		if (interaction_xp.dropped_text.getText().equalsIgnoreCase("Dropped!")) {
			System.out.println("droppable displayed, PASSED");
			test.log(LogStatus.PASS, "droppable displayed, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("droppable displayed, FAILED");
			test.log(LogStatus.FAIL, "droppable displayed, FAILED", test.addScreenCapture(fun.capture(driver)));

		}
	}

	public void resizable(ExtentTest test) throws IOException, InterruptedException {
		Interaction_xpath interaction_xp = new Interaction_xpath(driver);

		Thread.sleep(1000);
		fun.fluentWait(driver, interaction_xp.Resizable_submenu);
		fun.jsSrollIntoElement(driver, interaction_xp.Resizable_submenu);
		fun.Click(driver, interaction_xp.Resizable_submenu);
		System.out.println("Resizable submenu is clicked");

		Thread.sleep(500);
		fun.fluentWait(driver, interaction_xp.resizableBoxWithRestriction);
		Actions action = new Actions(driver);
		action.clickAndHold(interaction_xp.boxpointrest.get(0)).moveByOffset(100, 100).perform();
		System.out.println("Restriction box resized");
		test.log(LogStatus.PASS, "Restriction box resized, PASSED", test.addScreenCapture(fun.capture(driver)));

		Thread.sleep(700);
		fun.fluentWait(driver, interaction_xp.resizable);
		fun.jsSrollIntoElement(driver, interaction_xp.resizable);
		Actions action1 = new Actions(driver);
		action1.dragAndDropBy(interaction_xp.boxpointrest.get(1), 300, 300).perform();
		System.out.println("box resized");
		test.log(LogStatus.PASS, "box resized, PASSED", test.addScreenCapture(fun.capture(driver)));
		Thread.sleep(1000);
	}

}
