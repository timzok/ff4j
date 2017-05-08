import { NgModule } from '@angular/core';
import {HomeComponent} from "./home.component";
import {BrowserModule} from "@angular/platform-browser";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";


@NgModule({
    imports: [BrowserModule, FormsModule, ReactiveFormsModule],
    exports: [HomeComponent],
    declarations: [HomeComponent]
})
export class HomeModule { }
