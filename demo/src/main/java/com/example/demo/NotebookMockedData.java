package com.example.demo;

import javax.servlet.Registration;
import java.util.ArrayList;
import java.util.List;

public class NotebookMockedData {
    private String notebookData[][] = {
            {"1", "ASUS", "ROG-99", "Gaming", "i7-7700", "8 GB","15.6", "39600" },
            {"2", "HP", "OMEN 16", "Gaming", "i7-8700", "16 GB","15.6", "32000" },
            {"3", "Acer", "Switf 3", "Ultrabook", "i5-7700", "4 GB","13.3", "19900" },
            {"4", "Dell", "XPS 15" , "Ultrabook", "i7-7700", "16 GB","15.6", "41300" },
            {"5", "ASUS", "UX333", "Ultrabook", "i5-8700", "8 GB","13.3", "31600" },
            {"6", "Lenovo", "Yoga", "Ultrabook", "Ryzen 3", "8 GB","10.1", "15900" }
    };

    private List<NotebookDetail> notebook;
    private static NotebookMockedData instance = null;

    public static NotebookMockedData getInstance(){
        if (instance == null){
            instance = new NotebookMockedData();
        }
        return instance;
    }

    public NotebookMockedData() {
        notebook = new ArrayList<NotebookDetail>();
        for(int i = 0;i<notebookData.length;i++){
            int id = Integer.parseInt(notebookData[i][0]);
            String brand = notebookData[i][1];
             String title = notebookData[i][2];
             String type = notebookData[i][3];
             String cpu = notebookData[i][4];
             String ram = notebookData[i][5];
             String display = notebookData[i][6];
             String price = notebookData[i][7];
            notebook.add(NotebookFactory.makeNotebook(id,brand,title,type,cpu,ram,display,price));
        }

    }

    public List<NotebookDetail> allNotebook(){
        return notebook;
    };

    public NotebookDetail getNotebookById(int id){
        for(NotebookDetail m: notebook){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }

//    public NotebookDetail sellNotebook(int id, String title){
//        NotebookDetail newMoto = new NotebookDetail(id, title);
//        notebook.add(newMoto);
//        return newMoto;
//    }
}
