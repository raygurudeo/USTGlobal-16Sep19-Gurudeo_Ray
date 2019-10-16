import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    // tslint:disable-next-line:directive-selector
    selector : '[custDir]'
})
export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.color = 'red';
    }
    @HostBinding('style.backgroundColor') backgroundColor = 'green';
    @HostBinding('style.color') color = 'yellow';
    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = 'brown';
    }
    @HostListener('mouseleave') mouseLeaveEvent() {
        this.el.nativeElement.style.backgroundColor = 'green';
    }
}
