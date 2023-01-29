#A simple web app served by hhtpd
FROM httpd:2.4
LABEL AUTHOR=user@example.com
LABEL VERSION=0.1
COPY mypage.html htdocs/mypage.html