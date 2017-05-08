import {Component, OnInit, Input, EventEmitter, Output} from '@angular/core';
import {User} from "../../common/user";

@Component({
	moduleId: module.id,
	selector: 'user-list',
	templateUrl: 'user-list.component.html'
})
export class ListPetsComponent implements OnInit {

	@Input() users: User[];
	@Output() onClickUser: EventEmitter<User> = new EventEmitter<User>(false);


	constructor() {
	}

	ngOnInit() {}

  clickOnUser(user: User) {
    this.onClickUser.emit(user);
  }

}
