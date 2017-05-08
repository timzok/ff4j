import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {User} from "../common/user";

@Injectable()
export class UserSerive {

	constructor(private http:Http) {}

	getUsers() {
		return this.http.get("http://localhost:8080/user/");
	}


	update(user: User) {
		return this.http.post('http://localhost:8080/user/', user);
	}

	findUserById(id: string) {
		return this.http.get(`http://localhost:8080/user/${id}`)
	}
}
