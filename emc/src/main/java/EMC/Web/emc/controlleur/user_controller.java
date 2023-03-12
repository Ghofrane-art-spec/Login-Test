package EMC.Web.emc.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import EMC.Web.emc.entities.User;
import EMC.Web.emc.repo.UserRepo;
import EMC.Web.emc.service.UserService;

@RestController
public class user_controller {
	@Autowired
	private UserService us;
	
	@GetMapping("/login")
	public ResponseEntity<User> login(@RequestParam("matricule")Long matricule,@RequestParam("pwd")String pwd){
		Integer t=us.UserExists(matricule, pwd);
		if(t==0) {
			User user=us.FindUser(matricule, pwd);
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		else if(t==1) {
			User user=us.FindUser(matricule, pwd);
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		else {
			User u=us.FindMatricule(matricule);
			return new ResponseEntity<>(u, HttpStatus.OK);
		}
			
	}

}
