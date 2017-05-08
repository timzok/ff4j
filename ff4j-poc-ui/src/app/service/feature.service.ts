import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {User} from "../common/user";

@Injectable()
export class FeatureService {

  constructor(private http:Http) {}

  getFeatures() {
    return this.http.get("http://localhost:8080/feature/");
  }


  getFeatureForUser(user: User) {
    return this.http.get(`http://localhost:8080/featureForUser/${user}`)
  }
}
