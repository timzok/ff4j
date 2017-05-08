import { Component, OnInit } from '@angular/core';
import { User } from "../common/user";
import { UserSerive } from "../service/user.service";
import { FeatureService } from "../service/feature.service";


@Component({
    selector: 'home',
    templateUrl: 'home.component.html'
})
export class HomeComponent implements OnInit {

	users: User[];

    constructor(private userService: UserSerive, private featureService: FeatureService) { }

    ngOnInit() {
    	this.getUsers();
	}

	getUsers() {
		this.userService.getUsers().subscribe((response) => {
			this.users = response.json();
		});
	}

  loadUserFeatures(user: User) {
    console.log("load user fueature " + user.name);
      //this.featureService.getFeatureForUser(user);
  }

}
