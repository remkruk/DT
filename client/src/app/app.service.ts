import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class AppService {
  constructor(private http: HttpClient) {}

  getResponse() {
    return this.http.get<string>('http://localhost:8080/response');
  }
}
