# React Native SSL Pinning

1.  Get certificate from host

```
openssl s_client -servername www.google.com -connect www.google.com:443 -prexit -showcerts
```

2.  Copy text from BEGIN to END of last section and save to googlecert.pem file

3.  Added OkHttpCertPin.java and modify MainActivity.java

4.  Added pin key into OKHttpCertPin.java
