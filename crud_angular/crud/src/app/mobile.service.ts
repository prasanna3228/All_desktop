import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

HttpClient;

@Injectable({
  providedIn: 'root',
})
export class MobileService {
  constructor(private http: HttpClient) {}

  url = 'http://localhost:3004/mobiles';
  fetchMobile() {
    return this.http.get<any>(this.url);
  }

  deleteMobile(id: any) {
    return this.http.delete(this.url + '/' + id);
  }
}
