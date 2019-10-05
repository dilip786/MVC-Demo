# RecyclerView_With_Images_MVC

The main purpose of this app is retrieving from https://pixabay.com & showing on RecyclerView using Retrofit for doing HTTP request & GSON lib for parsing.

![images](https://user-images.githubusercontent.com/10658016/65835672-d1c26e00-e306-11e9-86ad-b925839a6d6b.png)
![images2](https://user-images.githubusercontent.com/10658016/65835673-d25b0480-e306-11e9-81e9-918365672e6a.png)

## Dependencies

```
def retrofit_version = "2.6.2";

implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"

```
# Android MVC Architecture 

<p align="left">
  <img src="https://user-images.githubusercontent.com/10658016/66260485-dd1d0a00-e7dc-11e9-9f31-bee1201edf47.png?raw=true" alt="Home Page" width="500"/>
</p>


* Model — the data layer, responsible for managing the business logic and handling network or database API.
* View — the UI layer — a visualisation of the data from the Model.
* Controller — the logic layer, gets notified of the user’s behavior and updates the Model as needed.

