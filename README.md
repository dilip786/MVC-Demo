### RecyclerView_With_Images_MVC

The main purpose of this app is retrieving from https://pixabay.com & showing on RecyclerView using Retrofit for doing HTTP request & GSON lib for parsing.

![images](https://user-images.githubusercontent.com/10658016/65835672-d1c26e00-e306-11e9-86ad-b925839a6d6b.png)
![images2](https://user-images.githubusercontent.com/10658016/65835673-d25b0480-e306-11e9-81e9-918365672e6a.png)

### Dependencies

```
def retrofit_version = "2.6.2";

implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"

```
### Android MVC Architecture 

<p align="left">
  <img src="https://user-images.githubusercontent.com/10658016/66260485-dd1d0a00-e7dc-11e9-9f31-bee1201edf47.png?raw=true" alt="Home Page" width="500"/>
</p>


### MVC (Model - View- Controller)

- Model: It is a Data layer, This is the responsible for Business logic and database operations
- View: It is a UI layer, This is the responsible for visualisation of the data coming from Model.
- Controller: It is a logic layer, Gets notified of the users behaviour and updates the model as needed

### Key Points:

- There is a direct line between View and controller, That means views knows which comptroller is associated with it and same controller knows which view is talking about, So there is no clear separation between view and controller.

- This is better than default android architecture where you would put everything in one activity.

