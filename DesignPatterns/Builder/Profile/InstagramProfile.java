public class InstagramProfile{
  private final String username;
  private final String bio;
  private final String email;
  private final String profilePicture;

  public InstagramProfile(InstagramProfileBuilder builder){
    this.username = builder.username;
    this.bio = builder.bio;
    this.email = builder.email;
    this.profilePicture = builder.profilePicture;
  }

  public static class InstagramProfileBuilder implements SocialProfileBuilder{
    private String username;
    private String bio;
    private String email;
    private String profilePicture;

    @Override
    public InstagramProfileBuilder username(String name){
     this.username = name;
     return this;
    }

    @Override
    public InstagramProfileBuilder bio(String bio){
     this.bio = bio;
     return this;
    }

    @Override
    public InstagramProfileBuilder email(String email){
     this.email = email;
     return this;
    }

    @Override
    public InstagramProfileBuilder profilePicture(String picture){
      this.profilePicture = picture;
      return this;
    }

    public InstagramProfile build(){
     if (this.username == null){
       throw new IllegalStateException("No Username");
     }

     if (this.email == null){
       throw new IllegalStateException("No Email");
     }

      return new InstagramProfile(this);
    }
  }
}
