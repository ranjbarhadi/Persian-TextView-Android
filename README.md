<div dir="rtl">

[![](https://jitpack.io/v/ranjbarhadi/Persian-TextView-Android.svg)](https://jitpack.io/#ranjbarhadi/Persian-TextView-Android)
# کتابخانه تکست ویو فارسی برای اندروید

کتابخانه ی PersianTextView یک کتابخانه ی مفید برای نوشتن با فونت دلخوه است. استفاده از این کتابخانه بسیار بسیار ساده است. برای این کار ابتدا فایل build.gradle در شاخه ی اصلی پروژه ی خود را تغییر داده و ریپاسیتوری jitpack.io را به آن اضافه کنید. در پایان شکل کد شما باید همانند زیر باشد:
<div dir="ltr">

    allprojects {
		repositories {
			[ریپاسیتوری های قبلی شما]
			maven { url 'https://jitpack.io' }
		}
	}

</div>
 سپس متن زیر را به فایل gradle خود و در بخش dependencies اضافه کنید.
<div dir="ltr">

    compile 'com.github.ranjbarhadi:Persian-TextView-Android:1.0'

</div>

----------
## نحوه ی استفاده ##

برای استفاده از این کتابخانه به سادگی فونت خود را با نام font.ttf در شاخه assets برنامه ی خود بریزید.
سپس می توانید 
در هرکجای برنامه ی خوددر اکتیویتی ها و فرگمنت ها بجای استفاده از TextView از ویو زیر استفاده کنید.

<div dir="ltr">

    <net.ranjbar.textview.persian
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="نمونه نوشته"
            />

</div>

به همین سادگی شما فونت برنامه ی خود را عوض کرده اید.
نتیجه چیزی شبیه به زیر می شود:
![enter image description here](https://github.com/ranjbarhadi/Persian-TextView-Android/blob/master/screenshot/img2.png?raw=true) 

شما می توانید با دانلود کردن این پروژه از نسخه ی نمایشی برای یادگیری بیشتر استفاده کنید.


<br>
<br>
<br>
لایسنس:
<br>
<br>
<div dir="ltr">

    MIT License

    Copyright (c) 2017 Hadi ranjbar

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
</dir>
</div>

























































































































































































































































































































































































































































