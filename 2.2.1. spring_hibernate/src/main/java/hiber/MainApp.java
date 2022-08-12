package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

//      User anna = new User("Anna", "Pola", "pola@mail.com");
//      User maria = new User("Maria", "Lolo", "lolo@mail.com");
//      User arsen = new User("Arsen", "hoho", "hoho@mail.com");
//
//      Car bmw = new Car("BMW M", 3);
//      Car audi = new Car("Audi 4", 5);
//      Car volvo = new Car("Volvo XC", 90);
//
//      userService.add(anna.setCar(bmw).setUser(anna));
//      userService.add(maria.setCar(volvo).setUser(maria));
//      userService.add(arsen.setCar(audi).setUser(arsen));
//
//      for (User user : userService.listUsers()){
//         System.out.println(user + " " + user.getCar());
//      }

      System.out.println(userService.getUserByCar("Volvo XC", 90));

      context.close();
   }
}
