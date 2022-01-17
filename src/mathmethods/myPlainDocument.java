/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmethods;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * This is myPlainDocument extends PlainDocument and Override the insertString method to
 * realize the effection of limiting input
 * @author Computer
 */
public class myPlainDocument extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        String regex = mathMethods.regex; //get the regex from mathmethods class
        str = str.replaceAll(regex,""); //As regex, replace all to ""
        str = str.replaceAll("[\\*]", "×"); //if there is any * change to ×
        str = str.replaceAll("[\\/]", "÷"); //if there is any / chagne to ÷
        super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public String modeChoose() {
//        Enumeration<AbstractButton> enu = mathMethods.modeButtonGroup.getElements();
//        JRadioButton radioBtn;
//        while(enu.hasMoreElements()) {
//            radioBtn = (JRadioButton)enu.nextElement();
//            if(radioBtn.getText().startsWith("P")) {
//                return "[^\\.\\+0-9]";
//            }else if(radioBtn.getText().startsWith("M")) {
//                return "[^\\.\\-0-9]";
//            }else if(radioBtn.getText().startsWith("T")) {
//                return "[^\\.\\*0-9]";
//            }else if(radioBtn.getText().startsWith("O")) {
//                return "[^\\.\\/0-9]";
//            }else {
//                return "";
//            }
//        }
//        return null;
//    }
    
    
}
