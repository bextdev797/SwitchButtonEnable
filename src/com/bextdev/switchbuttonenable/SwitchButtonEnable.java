package com.bextdev.switchbuttonenable;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.ButtonBase;

public class SwitchButtonEnable extends AndroidNonvisibleComponent {

  public SwitchButtonEnable(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Switches the button to enable or disable")
  public void SwitchButtonEnableDisable(ButtonBase button){
    if(button.Enabled()){
      button.Enabled(false);
    } else {
      button.Enabled(true);
    }
  }
}
