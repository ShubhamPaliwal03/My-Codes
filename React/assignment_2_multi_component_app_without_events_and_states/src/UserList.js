import UserCard from "./UserCard";

function UserList() {

    return (
        <>
            <UserCard
                name={"Shubham Paliwal"}
                headline={"Aspiring Software Developer, Passionate Computer Science Student"}
                profilePicUrl={"./images/users/shubham_paliwal.jpg"}
                workEx={{
                    post: 'Open Source Contributor',
                    company: 'GSSOC',
                    duration: {
                        start: '01 May 2024',
                        end: 'Present'
                    }
                }}
                contactInfo={{
                    phone: '+917728073435',
                    email: 'shubhampaliwal.dev@gmail.com'
                }}
                location={"Bikaner, Rajasthan, India"}
                socialMediaLinks={{
                    linkedin: 'https://www.linkedin.com/shubhammpaliwal',
                    twitter: 'https://x.com/shubhammpaliwal'
                }}
            />
            <UserCard
                name={"Tarun Verma"}
                headline={"Full Stack Developer, Programming Instructor, EdTuber"}
                profilePicUrl={"./images/users/tarun_verma.jpg"}
                workEx={{
                    post: 'Founder and Lead Programming Instructor',
                    company: 'C Institute',
                    duration: {
                        start: '01 April 2009',
                        end: 'Present'
                    }
                }}
                contactInfo={{
                    phone: '+917742817777',
                    email: 'tarun_vermabkn@gmail.com'
                }}
                location={"Bikaner, Rajasthan, India"}
                socialMediaLinks={{
                    linkedin: 'https://www.linkedin.com/tarunnverma',
                    twitter: 'https://x.com/tarunnverma'
                }}
            />
        </>
    );
}

export default UserList;