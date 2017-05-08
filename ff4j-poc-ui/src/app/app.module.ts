import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MdGridListModule } from '@angular/material';

import { AppComponent } from './app.component';
import { HomeModule } from "./home/home.module";
import {UserSerive} from "./service/user.service";
import {FeatureService} from "./service/feature.service";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    MaterialModule.forRoot(),
    BrowserAnimationsModule,
    MdGridListModule,
    HttpModule,
    HomeModule
  ],
  providers: [UserSerive, FeatureService],
  bootstrap: [AppComponent]
})
export class AppModule { }
