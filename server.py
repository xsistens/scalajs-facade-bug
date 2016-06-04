#!/usr/bin/env python
import os
from urllib.parse import urlparse
from http.server import HTTPServer
from http.server import SimpleHTTPRequestHandler

class MyHandler(SimpleHTTPRequestHandler):
    def do_GET( self ):
        urlParams = urlparse(self.path)
        if os.access( '.' + os.sep + urlParams.path, os.R_OK ):
            SimpleHTTPRequestHandler.do_GET(self);
        else:
            self.send_response(200)
            self.send_header( 'Content-type', 'text/html' )
            self.end_headers()
            with open('index.html', 'r') as f:
                html = f.read()
            self.wfile.write( html.encode() )

if __name__ == '__main__':
    httpd = HTTPServer(('127.0.0.1', 8000), MyHandler)
    httpd.serve_forever()