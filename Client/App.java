package Client;
import MVC.*;

public class App {
    public void start()  {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1- добавить работника\n")
                .append("2 - поменять отдел\n")
                .append("3 - показать отдел\n")
                .append("0 - выход\n");           
ConsoleView ui=new ConsoleView();
Presenter p =new Presenter();
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.AddPersona();
                    break;
                case "2":
                    p.UppdateDep();
                    break;          
                case "0":
                    break;
            }
        }
    }

    
    
}
