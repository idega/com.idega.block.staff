package com.idega.block.staff.presentation;

import com.idega.presentation.IWContext;
import com.idega.presentation.TabbedPropertyPanel;
import com.idega.user.presentation.GeneralUserInfoTab;
import com.idega.user.presentation.UserPhoneTab;
import com.idega.user.presentation.UserPropertyWindow;

/**
 * Title:        User
 * Copyright:    Copyright (c) 2001
 * Company:      idega.is
 * @author <a href="mailto:gummi@idega.is">Guðmundur Ágúst Sæmundsson</a>
 * @version 1.0
 */

public class StaffPropertyWindow extends UserPropertyWindow{

  //private static final String SESSION_ADDRESS = "st_staff_property_window";

  public StaffPropertyWindow(){
    super();
    this.setBackgroundColor("#d4d0c8");
  }

  public String getSessionAddressString(){
    return SESSION_ADDRESS;
  }

  public void initializePanel( IWContext iwc, TabbedPropertyPanel panel){
    panel.addTab(new GeneralUserInfoTab(), 0, iwc);
    panel.addTab(new StaffInfoTab(), 1, iwc);
    panel.addTab(new StaffImageTab(), 2, iwc);
    panel.addTab(new UserPhoneTab(), 3, iwc);
    panel.addTab(new StaffMetaTab(), 4, iwc);
    //panel.addTab(new UserGroupList(), 4, iwc);
  }

}
