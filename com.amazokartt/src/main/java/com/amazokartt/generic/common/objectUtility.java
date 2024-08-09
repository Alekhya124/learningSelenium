package com.amazokartt.generic.common;

import com.amazokartt.generic.excelutility.ReadExcelFile;
import com.amazokartt.generic.javautility.Javautility;
import com.amazokartt.generic.propertyfileutility.ReadpropertyFile;
import com.amazokartt.generic.webdriverutility.WebDriverUtility;

public class objectUtility {
 public  ReadExcelFile excelobj;
 public  Javautility javaobj;
 public  ReadpropertyFile propertyobj;
 public WebDriverUtility webdriverobj;
   
  public void objectcreation()
{
    excelobj =new ReadExcelFile();
    javaobj  =new Javautility ();
    propertyobj=new ReadpropertyFile();
    webdriverobj=new  WebDriverUtility();
   }
}
