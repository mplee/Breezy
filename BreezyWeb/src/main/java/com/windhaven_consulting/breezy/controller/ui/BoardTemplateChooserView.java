package com.windhaven_consulting.breezy.controller.ui;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.windhaven_consulting.breezy.manager.BreezyBoardTemplateManager;
import com.windhaven_consulting.breezy.manager.viewobject.BreezyBoardTemplate;

@ManagedBean
@SessionScoped
public class BoardTemplateChooserView {

	@Inject
	private BreezyBoardTemplateManager breezyBoardTemplateManager;
	
	public List<BreezyBoardTemplate> getBoardTemplates() {
		return breezyBoardTemplateManager.getAllBoardTemplates();
	}
	
}
