package entidades;
 
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
 
/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class FileRenderer extends JLabel implements ListCellRenderer<File> {

    public FileRenderer() {
        setOpaque(true);
    }   
    
    @Override
    public Component getListCellRendererComponent(JList<? extends File> list, File file, int index,
        boolean isSelected, boolean cellHasFocus) {
        
        setText(file.getName());
        if (isSelected) {
            setBackground(new Color(89, 110, 181));
            setForeground(new Color(255, 255, 255));
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
         
        return this;
    }
     
}