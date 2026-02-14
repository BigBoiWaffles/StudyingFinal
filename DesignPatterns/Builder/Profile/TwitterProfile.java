public class TwitterProfile{
  private final String username;
  private final String bio;
  private final String email;
  private final String profilePicture;

  private TwitterProfile(TwitterProfileBuilder builder){
    this.username = builder.username;
    this.bio = builder.bio;
    this.email = builder.email;
    this.profilePicture = builder.profilePicture;
  }

  public static class TwitterProfileBuilder implements SocialProfileBuilder{
    private String username;
    private String bio;
    private String email;
    private String profilePicture;

    @Override
    public TwitterProfileBuilder username(String name){
      this.username = name;
      return this;
    }

    @Override
    public TwitterProfileBuilder bio(String bio){
      this.bio = bio;
      return this;
    }

    @Override
    public TwitterProfileBuilder email(String email){
      this.email = email;
      return this;
    }

    @Override
    public TwitterProfileBuilder profilePicture(String picture){
      this.profilePicture = picture;
      return this;
    }

    public TwitterProfile build(){
     if (this.username == null){
       throw new IllegalStateException("No Username");
     }

      if (this.email == null){
        throw new IllegalStateException("No Email");
      }

      return new TwitterProfile(this);
    }
  }
}
