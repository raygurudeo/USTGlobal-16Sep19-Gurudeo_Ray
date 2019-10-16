import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'dollar'
})
export class DollarPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    return '$' + value;                     // we can modify value here that will goes to field of html.
  }

}
