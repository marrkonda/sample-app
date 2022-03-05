from flask import Flask
from flask import request
from flask import render_template

#Create an instance of the Flask class.
sample = Flask(__name__)

#Define a method to display the client IP address
@sample.route("/")
def main():
    return render_template("index.html")
#Configure the app to run locally
if __name__ == "__main__":
 sample.run(host="0.0.0.0", port=5050)
