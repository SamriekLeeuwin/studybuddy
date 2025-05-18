# Week 2 – Starting JWT & Learning About Testing

This week I started working on JWT authentication for StudyBuddy. I haven’t fully implemented it yet, but I set up most of the structure and I’m slowly figuring out how everything fits together.

---

## What I Did

- Set up payload classes:
    - `LoginRequest.java` (email + password)
    - `JwtResponse.java` (for the token and user info later)
- Created:
    - `JwtTokenUtil.java` (not finished yet)
    - `AuthController.java` (basic login endpoint started)
- Added a `Role` enum
- Updated `User.java` with security fields (locked, enabled, etc.) and made it implement `UserDetails`
- Organized the project folders:
    - Moved DTOs to `dto/`
    - Created `security/` for JWT-related logic
- Pushed everything to GitHub

---

## What I Learned

- How payloads work (and why you use request/response classes)
- The general idea behind JWTs (still wrapping my head around the full flow)
- That Spring Security can be complicated but powerful once you get the hang of it
- How helpful it is to break your code into clear layers and packages

---

## Thoughts

Still in the middle of setting up JWT, but I feel like I’m making progress.  
It’s not done yet, but I’ve built the foundation and it’s starting to make more sense.

I also realized I need to learn **how to write proper unit tests**, so I’m going to start reading about that next.

**Next week:** finish JWT login and try writing my first real test class 

---
