# React Native SSL Pinning

## Android

1.  Get certificate from host

```
openssl s_client -servername www.google.com -connect www.google.com:443 -prexit -showcerts
```

2.  Copy text from BEGIN to END of last section and save to googlecert.pem file

3.  RUN `python get_pin_from_certificate.py googlecert.pem` to get pin key

4.  Added OkHttpCertPin.java and modify MainActivity.java

5.  Added pin key into OKHttpCertPin.java

## iOS

1.  gem install cocoapods

2.  cd ios && pod init

3.  add `pod 'TrustKit'` into podfile

4.  pod install

5.  open xcode on project

* Open 'Build Settings', search 'Header Search Path'.
* Add $(SRCROOT)/../node_modules/react-native/React and set it recursive

6.  on AppDelegate.m add trustKitConfig

7.  run on simmulator

referrence

* https://github.com/facebook/react-native/issues/12077#issuecomment-302318906
* https://www.madebymany.com/stories/a-year-of-react-native-ssl-pinning
* https://stackoverflow.com/questions/40240321/how-can-i-implement-ssl-certificate-pinning-while-using-react-native/40334166#40334166
* https://stackoverflow.com/questions/40240321/how-can-i-implement-ssl-certificate-pinning-while-using-react-native
* https://github.com/Kudo/react-native-ssl-pinning-proposal
* https://github.com/datatheorem/TrustKit/blob/master/docs/getting-started.md
